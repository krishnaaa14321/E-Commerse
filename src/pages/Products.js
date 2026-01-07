import { useEffect, useState } from "react";
import API from "../api/api";

function Products() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    API.get("/api/products").then(res => setProducts(res.data));
  }, []);

  const addToCart = async (productId) => {
    const user = JSON.parse(localStorage.getItem("user"));
    await API.post(`/api/cart/add?userId=${user.id}&productId=${productId}&qty=1`);
    alert("Added to cart");
  };

  return (
    <div>
      <h2>Products</h2>
      {products.map(p => (
        <div key={p.id} style={{ border: "1px solid #ccc", margin: 10, padding: 10 }}>
          <h3>{p.name}</h3>
          <p>{p.description}</p>
          <p>₹{p.price}</p>
          <button onClick={() => addToCart(p.id)}>Add to Cart</button>
        </div>
      ))}
    </div>
  );
}

export default Products;
