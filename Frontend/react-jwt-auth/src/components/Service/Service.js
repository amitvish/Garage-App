import React, { useState } from 'react'
import userService from '../../services/user.service';

const Service = ({service}) => {
  
  const {id,serviceName,serviceDescription,price} = service;
    const [showContactInfo, setShowContactInfo] = useState(false);
    const handleDelete = (id)=>{
      console.log(id);
      userService.deleteService(id);
  }
  return (
    <div className="card mb-2">
            <div className="card-header">
              <h4>
              {serviceName}
              <button
                  className="fa fa-times"
                  style={{ cursor: "pointer", float: "right", color: "red" }}
                  onClick={()=>handleDelete(id)}
                >DEL</button>
                <button
                  className="fa fa-sort-down mr-5"
                  style={{ cursor: "pointer", float: "right" }}
                  onClick={() => setShowContactInfo(!showContactInfo)
                  }
                >Details</button>
                
              </h4>
            </div>
            {showContactInfo && (
              <div className="card-body">
                <ul className="list-group">
                  <li className="list-group-item">Description: {serviceDescription}</li>
                  <li className="list-group-item">Price: {price}</li>
                </ul>
              </div>
            )}
          </div>
  )
}

export default Service