import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [page, setPage] = useState("book");

  let content;
  if (page === "book") {
    content = <BookDetails />;
  } else if (page === "blog") {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  return (
    <div style={{ textAlign: "center", fontFamily: "Arial" }}>
      <h1>Blogger App</h1>
      <button onClick={() => setPage("book")}>Book</button>
      <button onClick={() => setPage("blog")}>Blog</button>
      <button onClick={() => setPage("course")}>Course</button>

      <hr />
      {content}
      <hr />
      {page === "book" ? (
        <BookDetails />
      ) : page === "blog" ? (
        <BlogDetails />
      ) : (
        <CourseDetails />
      )}

      <hr />

      {/* 3. Using Logical && Operator */}
      {page === "book" && <BookDetails />}
      {page === "blog" && <BlogDetails />}
      {page === "course" && <CourseDetails />}
    </div>
  );
}

export default App;
