import axios from "axios";
import { BASE_URL_DEV } from "../constants/constants";
import { capitalizeString } from "../utils/data-parse";

const services = {};

services.getByUser = async (idUser, filter = 'all') => {
  try {
    const { data } = await axios.get(`${BASE_URL_DEV}/consultoria/user?userId=${idUser}&sortby=startDate&sort=asc&filter=${filter}`);
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

services.getAll = async () => {
  try {
    const { data } = await axios.get(`${BASE_URL_DEV}/consultoria?filter=all`);
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

services.create = async (consultoria) => {
  try {
    const { data } = await axios.post(`${BASE_URL_DEV}/consultoria/new`, consultoria);
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
}

services.toggleStatus = async (idConsultoria, newStatus) => {
  try {
    const { data } = await axios.patch(`${BASE_URL_DEV}/consultoria/toggle/${idConsultoria}`, { status: capitalizeString(newStatus) });
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
}

export default services;
