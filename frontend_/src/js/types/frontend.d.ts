export interface LoginFormData {
  username: string;
  password: string;
}

export interface UserInfo {
  userName: string,
  email: string,
  mobilePhone: number,
  birthday: Date,
  gender: string,
  password: string
}

type LoginStatus = "loggedin" | "loggedout" | "neverloggedin" | "loginfailed";
