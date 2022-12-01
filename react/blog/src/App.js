/* eslint-disable */
import React from "react";
import "./App.css";
import MyComponents from "./components/MyComponents";

function App() {
  const str = "React!!!";
  const name = "인티저";

  return (
    <div>
      <p>안녕2333</p>
      {str}-{name}
      <MyComponents str={str} name={name} />
      <hr />
      <MyComponents age={100} />
      <hr />
      <MyComponents hi={"왜이럴까요?"} irum={name} />
      <hr />
      <MyComponents hi={"안녕?"} message={name} />
    </div>
  );
}

export default App;
