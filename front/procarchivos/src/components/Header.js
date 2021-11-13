import React from "react";
import Fade from 'react-reveal';
import ParticlesBg from "particles-bg";
import UploadFile from "../uploadFile/UploadFile";
import Login from "../login/Login.js";

function Header(){

    

    return(
        <header id="home">
            <ParticlesBg type="cobweb" bg={true}/>
            <nav id="nav-wrap">
                <ul id="nav" className="nav">
                    <li className="current">
                        <a className="smoothscroll" href="#home">&nbsp;</a>
                    </li>
                </ul>
            </nav>
            <div className="row banner">
                <div className="banner-text">
                    <UploadFile />
                </div>
            </div>            
        </header>
    )

}
export default Header;