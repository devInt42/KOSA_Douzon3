import React, { useState } from "react";
import "./App.css";

export default function App() {
  let name = "Jungsoo";
  let nickName = "Integer";
  let [title, setTitle] = useState(["센텀 맛집 우동", "홍대떡볶이 맛집"]);
  let [ok, setOk] = useState(0);
  //console.log(ok[1]+2);

  return (
    <div className="App">
      <div className="nav">{name} 소소한 일상 블로그</div>
      <p>{nickName}님 어서오세요.</p>
      <a
        className="App-link"
        href="https://cafe.naver.com/douzone3"
        target="_blank"
      >
        DouZone Th3 cafe
      </a>
      <p />
      <div className="title">
        {title[0]}
        <span
          onClick={() => {
            setOk(ok + 1);
          }}
        >
          👍
        </span>{" "}
        {ok}
      </div>
      <span>3월 31일 발행</span> <br />
      <hr />
      <div className="title">
        {title[1]}
        <span
          onClick={() => {
            setOk(ok + 1);
          }}
        >
          👍
        </span>{" "}
        {ok}
      </div>
      <span>3월 31일 발행</span> <br />
      <hr />
      <button
        onClick={() => {
          setTitle("혜화 맛집 우동");
        }}
      >
        title change
      </button>
    </div>
  );
}
