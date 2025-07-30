import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent page refresh
    const conversionRate = 0.011; // Example: 1 INR = 0.011 EUR
    setEuro((rupees * conversionRate).toFixed(2));
  };

  return (
    <div style={{ marginTop: "20px" }}>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
          required
        />
        <button type="submit">Convert</button>
      </form>
      {euro !== null && (
        <h3>
          {rupees} INR = {euro} EUR
        </h3>
      )}
    </div>
  );
}

export default CurrencyConvertor;
