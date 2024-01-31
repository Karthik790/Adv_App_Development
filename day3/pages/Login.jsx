import React from "react";
import '..//assets/css/login.css';
import { useNavigate } from 'react-router-dom';
import Navbar from "../components/NavBar";

function Login() {
  const navigate = useNavigate();

  const handleButtonClick = () => {
    // Use navigate to go to the desired route
    navigate('/UserLogin');
  };
  const handleButton_Click = () => {
    // Use navigate to go to the desired route
    navigate('/stafflogin');
  };

  return (
    <div>
    <Navbar/>
    <div className="login-container">
    
      <div className="login">
        <button onClick={handleButtonClick}>User</button>
        <button onClick={handleButton_Click}>Staff</button>


      </div>
      </div>
    </div>
  );
}

export default Login;


