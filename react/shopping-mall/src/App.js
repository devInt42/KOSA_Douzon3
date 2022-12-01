//  eslint-disable
import "./App.css";
import React, { useEffect, useState } from "react";
import { Button, Navbar, Container, Nav } from "react-bootstrap";
import Data from "./data.js";
import { Route, Routes, Link, Outlet, useNavigate } from "react-router-dom";
import Detail from "./components/Detail";
import Cart from "./components/Cart";
import styled from "styled-components";
import axios from "axios";

let UserDiv = styled.div`
  background: skyblue;
  padding: 25px;
  width: 30%;
  margin: 0 auto;
  text-align: center;
  font-size: 30px;
`;

function App() {
  let [shrits, setShrits] = useState(Data);
  let navigate = useNavigate(); // page move hook

  //   let [num, setNum] = useState('');  // isNaN('abc') : true , isNaN('123') : false
  //   useEffect(() => {
  //     if( isNaN(num) == true ) {
  //       alert('문자 숫자 안됩니다.')
  //     }
  //    }, [num])

  //   return (
  //     <input onChange={(e) =>{ setNum(e.target.value )}} />
  //    )
  //  }

  let [sales, setSales] = useState(true);
  // useEffect(() => {
  //   let inteval = setInterval(() => {
  //     setTimeout(() => {
  //       setSales(false);
  //     }, 2000)
  // }, []);

  // useEffect(() => {
  //   let timer = setTimeout(() => {
  //     setSales(false);
  //   }, 3000);
  //   return () => {
  //     clearTimeout(timer);
  //   };
  // }, []);

  return (
    <div className="App">
      {/* <UserDiv>user style</UserDiv> */}
      <Navbar bg="dark" variant="dark">
        <Container>
          <Navbar.Brand href="#home">DouZone Shop</Navbar.Brand>
          <Nav className="me-auto">
            {/* <Link to="/">홈</Link>
            <Link to="/detail">상세페이지</Link> */}
            {/* <Nav.Link ="/">Home</Nav.Link>
            <Nav.Link href="/cart">Cart</Nav.Link> */}

            <Nav.Link
              onClick={() => {
                navigate("/");
              }}
            >
              Home
            </Nav.Link>
            <Nav.Link
              onClick={() => {
                navigate("/cart");
              }}
            >
              Cart
            </Nav.Link>

            <Nav.Link href="/detail/0">Detail</Nav.Link>
            <Nav.Link href="/About">회사소개</Nav.Link>
          </Nav>
        </Container>
      </Navbar>

      <div class="jumbotron">
        <h1 class="display-4">Hello, world!</h1>
        <p class="lead">
          This is a simple hero unit, a simple jumbotron-style component for
          calling extra attention to featured content or information.
        </p>
        {/* <div className='main-img'></div> */}
        <p>
          It uses utility classes for typography and spacing to space content
          out within the larger container.
        </p>
        {/* <a class="btn btn-primary btn-lg" href="#" role="button">30% DC !!</a> */}
        {/* {sales === true ? (
            <UserDiv>
              <p> 5일 동안 Discount.</p>
            </UserDiv>
            ) : null
          } */}
      </div>

      <Routes>
        <Route
          path="/"
          element={
            <>
              <div class="container">
                <div class="row">
                  {/* 배열데이터.map( ()=>{}  ) */}
                  {shrits.map((a, i) => {
                    return <Card shrits={shrits[i]} i={i} key={i} />;
                  })}
                </div>
              </div>
              <Button
                onClick={() => {
                  axios.get("url").then();
                  axios.get("url").then().catch();
                  axios
                    .get(
                      "https://raw.githubusercontent.com/ai-edu-pro/busan/main/data2.json"
                    )
                    .then((result) => {
                      //console.log(result.data);
                      //console.log(shrits);
                      let copy = [...shrits, ...result.data];
                      setShrits(copy);
                    })
                    .catch(() => {
                      console.log("서버로부터 데이터 전송 실패함");
                    });

                  // Promise.all([axios.get('url1'), axios.get('url2')])
                  // .then(()=>{ })

                  // fetch('https://raw.githubusercontent.com/ai-edu-pro/busan/main/data2.json')
                  // .then((result)=>{
                  //   console.log(result.data);
                  //   console.log(shrits);
                  //   // let copy = [...shrits, ...result.data];
                  //   // setShrits(copy);
                  // })
                  // //.then((result)=>{ console.log(result.data); })
                  // .catch(()=>{ console.log('서버로부터 데이터 전송 실패함');})
                }}
              >
                더보기
              </Button>
            </>
          }
        />

        <Route path="/cart" element={<Cart />} />

        <Route path="/detail/:id" element={<Detail shrits={shrits} />} />

        <Route
          path="*"
          element={
            <div style={{ color: "red", fontSize: "20px" }}>
              없는 페이지 입니다
            </div>
          }
        />

        <Route path="/about" element={<About />}>
          <Route path="emp" element={<div>너는 우리 직원이야</div>} />
          <Route path="location" element={<div>혜화역 4번 출구</div>} />
        </Route>
      </Routes>

      {/* <div className='main-img'></div> */}
    </div>
  );
}

function About() {
  return (
    <>
      <h4>회사정보 컴포넌트</h4>
      <Outlet></Outlet>
    </>
  );
}

// '문자'+변수+'문자'
function Card(props) {
  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6">
          <a href={`/detail/${props.i}`}>
            <img
              src={
                "https://raw.githubusercontent.com/ai-edu-pro/busan/main/t" +
                (props.i + 1) +
                ".jpg"
              }
              width="80%"
            />
          </a>
        </div>
        <div className="col-md-6">
          <h4 className="pt-5">{props.shrits.title}</h4>
          <p>{props.shrits.content}</p>
          <p>{props.shrits.price}</p>
        </div>
      </div>
    </div>
  );
}

export default App;
