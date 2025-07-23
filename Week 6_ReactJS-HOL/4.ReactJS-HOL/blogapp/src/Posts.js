import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }

  // Step 6
  loadPosts = async () => {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/posts"
      );
      const data = await response.json();
      const postObjects = data.map(
        (p) => new Post(p.userId, p.id, p.title, p.body)
      );
      this.setState({ posts: postObjects });
    } catch (error) {
      this.setState({ error });
    }
  };

  // Step 7
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9
  componentDidCatch(error, info) {
    alert("An error occurred in Posts component.");
    console.error(error, info);
  }

  // Step 8
  render() {
    const { posts } = this.state;
    return (
      <div>
        <h2>Blog Posts</h2>
        {posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
