import React, { useState } from "react";
import "./App.css";
import CurrencyConvertor from "./CurrencyConventor";

// App component

function App() {
  const [count, setCount] = useState(0);
  const increment = () => {
    setCount(count + 1);
  };
  const decrement = () => {
    setCount(count - 1);
  };

  // Synthetic event handler
  const handlePress = (e) => {
    e.preventDefault();
    alert("I was clicked (Synthetic Event)!");
    console.log("Event Object:", e); // shows synthetic event
  };

  return (
    <div style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
      <h1>React Event Examples</h1>
      <h2>Counter: {count}</h2>
      <button
        onClick={() => {
          increment();
        }}
      >
        Increment
      </button>
      <button onClick={decrement}>Decrement</button>
      <hr />
      <button onClick={handlePress}>Synthetic Event Button</button>

      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
