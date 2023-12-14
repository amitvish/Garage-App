import React, { Component, useRef } from "react";
import userService from "../../services/user.service";



const AddService = () => {
    const ref1 = useRef(null);
    const ref2 = useRef(null);
    const ref3 = useRef(null);
    const handleSubmit = (e)=>{
        e.preventDefault();
        userService.newService(ref1.current.value,ref2.current.value,ref3.current.value)
    }

    

  return (
    <div className="col-md-12">
      <div className="card card-container">
        

        <form onSubmit={handleSubmit}
        >
          <div className="form-group">
            <label htmlFor="username">Service name</label>
            <input
              type="text"
              className="form-control"
              ref={ref1}
            />
          </div>
          <div className="form-group">
            <label htmlFor="username">Service Description</label>
            <input
              type="text"
              className="form-control"
              ref={ref2}
            />
          </div>

          <div className="form-group">
            <label htmlFor="password">Price</label>
            <input
              type="text"
              className="form-control"
              ref={ref3}
            />
          </div>

          <div className="form-group">
            <button
              className="btn btn-primary btn-block"
            >
              <span>Add Service</span>
            </button>
          </div>
        </form>
      </div>
    </div>
  );
  
}

export default AddService