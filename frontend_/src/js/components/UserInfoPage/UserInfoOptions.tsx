import styled from '@emotion/styled';
import * as React from 'react';

interface UserInfoOptionsProps {
  setSelected:React.Dispatch<React.SetStateAction<"PersonalInfo" | "FavoriteApartments" | "FriendsDisplay">>
}
 
const UserInfoOptions: React.FunctionComponent<UserInfoOptionsProps> = (props: UserInfoOptionsProps) => {

  const OptionsWrapper = styled('div')({width:'300px', height:'100%'})

  return ( 
  <OptionsWrapper>
    <div>Profile</div>
    <div onClick={() => {props.setSelected('PersonalInfo')}}>Personal Information</div>
    <div onClick={() => {props.setSelected('FavoriteApartments')}}>Favorite Apartments</div>
    <div onClick={() => {props.setSelected('FriendsDisplay')}}>Friends & Roommates</div>    
  </OptionsWrapper> );
}
 
export default UserInfoOptions;