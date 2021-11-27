import React, { useMemo } from 'react';
import { useDropzone } from 'react-dropzone';
import XLSX from "xlsx";

function UploadFile(){

    const baseStyle = {
        flex: 1,
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        padding: '20px',
        borderWidth: 2,
        borderRadius: 2,
        borderColor: '#eeeeee',
        borderStyle: 'dashed',
        backgroundColor: '#fafafa',
        color: '#bdbdbd',
        outline: 'none',
        transition: 'border .24s ease-in-out'
      };
      
      const activeStyle = {
        borderColor: '#2196f3'
      };
      
      const acceptStyle = {
        borderColor: '#00e676'
      };
      
      const rejectStyle = {
        borderColor: '#ff1744'
      };

    const {
        fileRejections,
        isDragActive,
        isDragAccept,
        isDragReject, getRootProps, getInputProps
        } = useDropzone(
        {
            accept : 'application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet',
            noDrag: true,
            multiple: false,
            onDrop: file => handleFile(file)
        }
    );

    const [data, setData] = React.useState([]);
    const [cols, setCols] = React.useState([]);

    const handleFile = (file) => {
      const reader = new FileReader();
      reader.onload = (e) => {
        const ab = e.target.result;
        const wb = XLSX.read(ab, {type: 'array'});
        const wbName = wb.SheetNames[0];
        const ws = wb.Sheets[wbName];
        const data = XLSX.utils.sheet_to_json(ws, {raw:true});

        setData(data);
        setCols(make_cols(ws['!ref']));
      };
      reader.readAsArrayBuffer(new Blob(file));
    };

    /* generate an array of column objects */
    const make_cols = refstr => {
      let o = [], C = XLSX.utils.decode_range(refstr).e.c + 1;
      for(var i = 0; i < C; ++i) o[i] = {name:XLSX.utils.encode_col(i), key:i}
      return o;
    };

    const fileRejectionsItems = fileRejections.map(({file, errors}) => (
        <li key={file.path}>
            {file.path} - {file.size} bytes
            <ul>
                {errors.map(e => (
                    <li key={e.code}>{e.message}</li>
                ))}
            </ul>
        </li>
    ));

    const style = useMemo(() => ({
        ...baseStyle,
        ...(isDragActive ? activeStyle : {}),
        ...(isDragAccept ? acceptStyle : {}),
        ...(isDragReject ? rejectStyle : {})
      }), [
        isDragActive,
        isDragReject,
        isDragAccept
      ]
    );

    return(
        <section id="contact">
          {console.log(data)}
            <div {...getRootProps({ style })}>
                <input {...getInputProps()} />
                <p>Seleccione el archivo a cargar...</p>
            </div>
        </section>
    );
}
export default UploadFile;