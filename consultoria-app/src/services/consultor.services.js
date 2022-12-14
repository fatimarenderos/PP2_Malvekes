import axios from "axios";
import { BASE_URL_DEV } from "../constants/constants";

const services = {};

services.create = async (consultor) => {
  try {
    const { data } = await axios.post(`${BASE_URL_DEV}/consultor/new`, consultor);
    return data;
  } catch (error) {
    if (error.response) {
      return error.response.data;
    } else {
      return {
        ok: false,
        msg: error,
      };
    }
  }
};

services.search = async (search) => {
  try {
    const { data } = await axios.get(`${BASE_URL_DEV}/consultor/search?term=${search}`);
    return data;
  } catch (error) {
    if (error.response) {
      return error.response.data;
    } else {
      return {
        ok: false,
        msg: error,
        consultores: [],
      };
    }
  }
}

export default services;
