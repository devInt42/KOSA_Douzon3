/* eslint-disable */
import React from "react";
import "./App.css";
import MyComponents from "./components/MyComponents";

function App() {
  const str = "React!!!";
  const name = "인티저";
  const msg = 100;

  return (
    <div>
      <h1>React start</h1>
      <p>안녕2333</p>
      {str}-{name}
      <MyComponents str={str} name={name} />
      <MyComponents age={100} />
      <MyComponents hi={"왜이럴까요?"} irum={name} />
    </div>
  );
}

export default App;
