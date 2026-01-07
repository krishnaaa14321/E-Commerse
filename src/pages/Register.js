import { useState } from "react";
import API from "../api/api";

function Register() {
  const [user, setUser] = useState({ name: "", email: "", password: "" });

  const register = async () => {
    await API.post("/api/users/register", user);
    alert("Registered Successfully");
  };

  return (
    <div>
      <h2>Register</h2>
      <input placeholder="Name" onChange={e => setUser({ ...user, name: e.target.value })} />
      <input placeholder="Email" onChange={e => setUser({ ...user, email: e.target.value })} />
      <input placeholder="Password" type="password"
             onChange={e => setUser({ ...user, password: e.target.value })} />
      <button onClick={register}>Register</button>
    </div>
  );
}

export default Register;
