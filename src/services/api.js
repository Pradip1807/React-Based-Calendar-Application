import axios from 'axios';

const API_URL = 'http://localhost:8080/api'; // Replace with your backend URL

export const getCompanies = async () => {
    const response = await axios.get(`${API_URL}/companies`);
    return response.data;
};

export const addCompany = async (company) => {
    const response = await axios.post(`${API_URL}/companies`, company);
    return response.data;
};

export const deleteCompany = async (id) => {
    await axios.delete(`${API_URL}/companies/${id}`);
};

export const getCommunications = async () => {
    const response = await axios.get(`${API_URL}/communications`);
    return response.data;
};

export const addCommunication = async (communication) => {
    const response = await axios.post(`${API_URL}/communications`, communication);
    return response.data;
};
