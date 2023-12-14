import React, { useEffect, useState } from 'react'
import userService from '../../services/user.service';
import Service from './Service';

const Services = () => {
    const [services,setServices] = useState([]);
    useEffect(()=>{
        userService.getServies().then(resp=>setServices(resp.data));
    },[])
    
  return (
    <>
     {
        services.map((service)=>{
            return <Service key={service.id} service = {service}/>
        })}
    
    </>
  )
}

export default Services