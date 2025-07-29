import React from "react";

const IndianPlayers = () => {
  const T20players = ["Rohit Sharma", "Virat Kohli", "Suryakumar Yadav"];
  const RanjiTrophy = ["Mayank Agarwal", "Cheteshwar Pujara", "Ajinkya Rahane"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];
  const [p1, p2, p3, p4, p5, p6] = mergedPlayers;

  return (
    <div>
      <h2>Indian Players</h2>
      <p>
        <strong>Odd Team Players:</strong> {p1}, {p3}, {p5}
      </p>
      <p>
        <strong>Even Team Players:</strong> {p2}, {p4}, {p6}
      </p>
    </div>
  );
};

export default IndianPlayers;
