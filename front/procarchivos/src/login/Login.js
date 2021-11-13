import React from "react";
import { Fade, Slide } from "react-reveal";

function Login(){

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
                                    <label htmlFor="email">Correo<span className="required">*</span></label>
                                    <input type="text" defaultValue="" id="txtCorreo" name="txtCorreo" />
                                </div>
                                <div>
                                    <label htmlFor="contrasena">Correo<span className="required">*</span></label>
                                    <input type="password" defaultValue="" id="txtContrasena" name="txtContrasena" />
                                </div>
                                <div>
                                    <button className="submit" onClick={() => alert("toma tu click")}>Ingresar</button>
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