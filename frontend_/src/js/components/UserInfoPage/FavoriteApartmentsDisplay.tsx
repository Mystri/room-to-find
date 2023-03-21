import * as React from 'react';
import useUserInfo from '../../common/UseUserInfo';
import { useEffect, useState } from 'react';
import axios from 'axios';
import { fullUrl } from '../../../backend';
interface UserInfoDisplayProps {

}

type Apartment = {
  name:string, 
  state:string, 
  city:string, 
  street:string, 
  zip:number, 
  lat:number, 
  lng:number, 
  structure:string,
}

const FavoriteApartmentDisplay: React.FunctionComponent<UserInfoDisplayProps> = () => {

  const [userInfo, setUserInfo] = useUserInfo();
  const [apartments, setApartments] = useState<Array<Apartment>>([]);

  useEffect(() => {
    axios.get(fullUrl(`/api/favapt/${userInfo.userId}`))
      .then((response) => {
        console.log(response);
        setApartments([]);
      })
      .catch((e) => {
        console.log(e);
      })
  }, []);

  return (<div>
    {`Favourite Apartments`}

  </div>);
}

export default FavoriteApartmentDisplay;