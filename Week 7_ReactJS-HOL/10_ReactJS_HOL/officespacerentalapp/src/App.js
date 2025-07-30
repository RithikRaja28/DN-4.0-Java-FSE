import React from "react";
import "./App.css";

// Create a list of office objects
const officeSpaces = [
  {
    id: 1,
    name: "Skyline Tower",
    rent: 55000,
    address: "Bengaluru, MG Road",
    image: "https://via.placeholder.com/200",
  },
  {
    id: 2,
    name: "Tech Park Hub",
    rent: 70000,
    address: "Hyderabad, Hitech City",
    image: "https://via.placeholder.com/200",
  },
  {
    id: 3,
    name: "Green Plaza",
    rent: 45000,
    address: "Chennai, Anna Nagar",
    image: "https://via.placeholder.com/200",
  },
];

function App() {
  return (
    <div style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
      <h1>Office Space Rental App</h1>

      {/* Looping through the officeSpaces array */}
      {officeSpaces.map((office) => (
        <div
          key={office.id}
          style={{
            border: "1px solid #ccc",
            margin: "20px auto",
            padding: "20px",
            width: "400px",
            borderRadius: "10px",
          }}
        >
          {/* Display Image with JSX attribute */}
          <img
            src={office.image}
            alt={office.name}
            style={{ width: "100%", borderRadius: "8px" }}
          />

          <h2>{office.name}</h2>
          <p>
            <strong>Address:</strong> {office.address}
          </p>
          <p
            style={{
              color: office.rent < 60000 ? "red" : "green",
              fontWeight: "bold",
            }}
          >
            Rent: ₹{office.rent.toLocaleString()}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
