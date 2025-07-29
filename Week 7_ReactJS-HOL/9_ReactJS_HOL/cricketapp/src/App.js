import React from "react";
import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";


function App() {
  const flag = true; // change to false to see IndianPlayers

  return (
    <div style={{ textAlign: "center" }}>
      <h1>🏏 Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
