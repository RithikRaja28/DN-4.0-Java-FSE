import React, { useState } from "react";
import "./App.css";

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      
    </div>
  );
}

function UserPage({ onLogout }) {
  return (
    <div>
      <h2>Welcome User!</h2>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  // Define element variable
  let content;

  if (isLoggedIn) {
    content = <UserPage onLogout={() => setIsLoggedIn(false)} />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div style={{ textAlign: "center", fontFamily: "Arial" }}>
      {isLoggedIn ? (
        <p>You are logged in.</p>
      ) : (
        <p>You are browsing as Guest.</p>
      )}
      {content}
      {!isLoggedIn && (
        <button onClick={() => setIsLoggedIn(true)}>Login</button>
      )}
    </div>
  );
}

export default App;
