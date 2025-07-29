import React from "react";

const ListofPlayers = () => {
  // Declare array of 11 players with name and score
  const players = [
    { name: "Virat Kohli", score: 95 },
    { name: "Rohit Sharma", score: 88 },
    { name: "Shubman Gill", score: 65 },
    { name: "Suryakumar Yadav", score: 45 },
    { name: "Hardik Pandya", score: 72 },
    { name: "Rishabh Pant", score: 51 },
    { name: "Ravindra Jadeja", score: 34 },
    { name: "Kuldeep Yadav", score: 27 },
    { name: "Mohammed Shami", score: 15 },
    { name: "Jasprit Bumrah", score: 10 },
    { name: "Mohammed Siraj", score: 8 },
  ];

  // Filter players using arrow function (score >= 70)
  const highScorers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {highScorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
