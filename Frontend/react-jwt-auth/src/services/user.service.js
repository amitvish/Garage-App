import axios from 'axios';
import authHeader from './auth-header';

const API_URL = 'http://localhost:8080/services';

class UserService {
  newService(serviceName,serviceDescription,price){
    return axios.post(API_URL,{serviceName,serviceDescription,price},{headers:authHeader()});
  }
  getServies(){
    return axios.get(API_URL,{headers:authHeader()});
  }
  deleteService(id){
    return axios.delete(API_URL+"/"+id,{headers:authHeader()});
  }
}

export default new UserService();
