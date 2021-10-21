import React, { useMemo, useCallback } from 'react';
import { useDropzone } from 'react-dropzone';

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
            onDrop: file => console.log(file)
        }
    );

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
            <div {...getRootProps({ style })}>
                <input {...getInputProps()} />
                <p>Seleccione el archivo a cargar...</p>
            </div>
            <aside>
                <h4>Rejected files</h4>
                <ul>{fileRejectionsItems}</ul>
            </aside>
        </section>
    );
}
export default UploadFile;