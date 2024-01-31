import React from 'react';
const logoimg="https://www.logologo.com/logos/eagle-logo-design-free-logo.jpg";
const Logo = () => {
  return (
    <div className="logo">
      {/* Your logo content or image */}
      <img src={logoimg} alt="Logo" style={{width:"60px",height:"60px",float:"left"}}/>
    </div>  );
};

export default Logo;