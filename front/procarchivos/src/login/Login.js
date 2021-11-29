import React from "react";
import { Fade, Slide } from "react-reveal";
import { Navigate } from 'react-router-dom';

function Login(){

    const [info, setInfo] = React.useState();

    const handleChange = (e) => {
        const { name, value } = e.target;
        setInfo({...info, [name]: value});
    }

    function singin(event){
        event.preventDefault();
        var url = "http://ubosquelogin-env.eba-3iqmbjfp.us-east-2.elasticbeanstalk.com/api/login";
        
        fetch(url,{
            mode: 'cors',
            method: "POST",
            body: JSON.stringify(info)
        })
        .then(data => data.json())
        .then(response => {
            if(response.code == "200"){
                window.location.href = "/file";
            }else{
                alert("Valide las credenciales");
            }
        });
    }

    return(
        <section id="contact">
            <Fade bottom duration={1000}>
                <div className="row section-head">
                    <h1><span>Sign In</span></h1>
                </div>
            </Fade>
            <div className="row">
                <Slide left duration={1000}>
                    <div className="eight columns">
                        <form action="" method="post" id="loginForm" name="loginForm">
                            <fieldset>
                                <div>
                                    <label htmlFor="email">Identificación: <span className="required">*</span></label>
                                    <input type="text" defaultValue="" id="usuario" name="usuario" onChange={handleChange} />
                                </div>
                                <div>
                                    <label htmlFor="contrasena">Constraseña: <span className="required">*</span></label>
                                    <input type="password" defaultValue="" id="contrasena" name="contrasena" onChange={handleChange}/>
                                </div>
                                <div>
                                    <button className="submit" onClick={(e) => singin(e)}>Ingresar</button>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </Slide>
            </div>
        </section>
    );
}
export default Login;