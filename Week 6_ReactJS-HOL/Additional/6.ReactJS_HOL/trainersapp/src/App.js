// src/App.js
import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./Home";

import TrainerDetails from "./TrainerDetails";
import trainers from "./TrainersMock";
import TrainerList from "./Trainerlist";

function App() {
  return (
    <Router>
      <div>
        <h1>Trainers Management App</h1>
        <nav>
          <Link to="/">Home</Link> | <Link to="/trainers">Trainers List</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route
            path="/trainers"
            element={<TrainerList trainers={trainers} />}
          />
          <Route path="/trainer/:id" element={<TrainerDetails />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
