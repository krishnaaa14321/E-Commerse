import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav style={{ padding: 10, background: "#222", color: "#fff" }}>
      <Link to="/" style={{ margin: 10, color: "#fff" }}>Products</Link>
      <Link to="/cart" style={{ margin: 10, color: "#fff" }}>Cart</Link>
      <Link to="/login" style={{ margin: 10, color: "#fff" }}>Login</Link>
      <Link to="/register" style={{ margin: 10, color: "#fff" }}>Register</Link>
    </nav>
  );
}

export default Navbar;
