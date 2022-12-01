/* eslint-disable */

import "./App.css";
import { useState, useEffect } from "react";

//class UserApp extends React.Component{ }

function App() {
  let [title, setTitle] = useState([
    "혜화 맛집 튀김",
    "송파 샤브샤브",
    "홍대 일식집",
  ]);
  let [like, setLike] = useState([0, 0, 0]); // useState("string") 훅은 배열 형태로 2개의 값이 전달된다.
  let [modal, setModal] = useState(false);
  let [flag, setFlag] = useState(false);

  function titleChange() {
    let newTitle = [...title];
    newTitle[0] = "센텀 고기 맛집";
    setTitle(newTitle);
  }

  function titleSort() {
    let titleSort = [...title];
    titleSort = title.sort();
    setTitle(titleSort);
  }

  function onoff() {
    if (modal === false) {
      setModal(true);
    } else if (modal === true) {
      setModal(false);
    }
  }

  return (
    <>
      <div className="App">
        <div className="blue-nav">
          <div> Happy DoYeon 블로그 </div>
        </div>
      </div>
      <p>
        <button onClick={titleChange}>0번째 제목 변경</button>
        <button onClick={titleSort}>제목 오름차순 정렬</button>
      </p>

      {title.map(function (a, index) {
        return (
          <div className="list" key={index}>
            <h3
              onClick={() => {
                setFlag(true);
              }}
            >
              {title[index]}
              <span
                onClick={() => {
                  setLike(like + 1);
                }}
              >
                {" "}
                👍{" "}
              </span>{" "}
              {like[index]}
            </h3>
            <span>3월 31일 발행</span>
          </div>
        );
      })}

      {/* <div  className='list'>
          <h3> {title[1]}  <span onClick={()=>{ setLike(like + 1)} }> 👍 </span> {like} </h3>
          <p>6월 2일 발생</p>
        </div>
        <div  className='list'>
          <h3> {title[2]}  <span onClick={()=>{ setLike(like + 1)} }> 👍 </span> {like} </h3>
          <p>12월 20일 발생</p>
      </div>  */}

      <button
        onClick={() => {
          onoff;
        }}
      >
        MyModal ON/OFF
      </button>
      {modal === true ? <MyModal title={title} flag={flag} key={key} /> : null}
    </>
  );
}

function MyModal(props) {
  return (
    <div className="modal" key={index}>
      <h2>{props.title[index]}</h2>
      <p>날짜</p>
      <p>상세내용</p>
    </div>
  );
}

export default App;
