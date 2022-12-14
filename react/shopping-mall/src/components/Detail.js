/* eslint-disable */

import { useContext, useEffect, useState } from "react";
import { Button, Nav } from "react-bootstrap";
import { useDispatch } from "react-redux";
import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import { StockContext } from '../App'
import {  addItem } from "../store";


let ColorBtn = styled.button`
      background: ${props => props.bg};
      color:  ${props => props.bg == 'blue' ? 'aqua' : 'black'};
      padding: 10px;
    `
// let NewColorBtn = styled.button(ColorBtn)`    
//       color: blue;
//     `
let UseDiv = styled.div`
      background: grey;
      padding: 20px;
    `


function Detail(props) {

  let {stock} = useContext(StockContext);
   
  //setTimeout(() => {실행 코드}, 시간)
  
  
  let {id} = useParams();
  let navigate = useNavigate(); // react-router-dom@6 버전부터 useHistroy() Hook은 사용안됨

  let findId = props.shrits.find((x)=> x.id == id);
  //console.log(findId);
  let [count, setCount] = useState(0);
  let [alert2, setAlert2] = useState(true);

  //최근 본 상품 목록 저장
  useEffect(()=>{
    let outData = localStorage.getItem('watched')  // App.js에 셋팅 되어 있는것 꺼내옴 
    outData = JSON.parse(outData) // JSON -> array
    outData.push(findId.id)   
    outData = new Set(outData)  // 중복제거
    outData = Array.from(outData) // set --> array 
    localStorage.setItem('watched', JSON.stringify(outData))
  }, [])

  useEffect(() => {
    //setTimeout(() => {   }, timeout);
    //setInterval(() => { }, interval);
            
    let timer = setTimeout(() => {
      setAlert2(false);
    }, 3000);
    return () => {
      clearTimeout(timer);
    };
  }, []);

  let [num, setNum] = useState('');
  useEffect((e) => {
    if(isNaN(num) == true) {
      alert('숫자 아닙니다.');
    }
  },[num] )

  // 탭버튼 누른 상태 변화 제어
  let [clickTab, setClickTab] = useState(0);
  // useEffect(()=>{
  //   let tab = setTimeout(() => {
      
  //   }, 2000);
  // })

  let dispatch = useDispatch();

  return(
    <div className='container'> 
     {/* {count}<button onClick={()=>{ setCount(count+1)}}>버튼</button> */}

     {alert2 === true ? (
        <div className="alert alert-warning">
          <p>재고가 얼마 남지 않았습니다.</p>
        </div>
      ) : null}

      {/* {stock} */}

       <div className='row'>
        <div className="col-md-6">  
        
          {/* <img src='https://raw.githubusercontent.com/ai-edu-pro/busan/main/t1.jpg' width="80%" /> */}
          <img src={
              'https://raw.githubusercontent.com/ai-edu-pro/busan/main/t' 
              +  (findId.id + 1) 
              + '.jpg'} width="80%" />
        </div>
      <div className="col-md-6">  
            <h4 className='pt-5'>{findId.title}</h4>
            <p>{findId.content}</p>
            <p>{findId.price}원</p>

            <p><input onChange={(e) =>{ 
                setNum(e.target.value); 
                e.target.value = '';
              }} />개</p>
          
            <button className='btn btn-danger' 
              onClick={()=>{
                //dispatch(addItem(`{id : ${findId.id}, name : ${findId.title}, count : ${e.target.value}}`)) 
                dispatch(addItem({id : 3, name : 'Black and White', count : 1})) 
                navigate('/cart')
              }}>주문하기</button>&nbsp;
          

            <button onClick={()=>{navigate(-1)}}className="btn btn-primary">뒤로가기</button>&nbsp;
            <button onClick={()=>{navigate("/cart")}}className="btn btn-dark">장바구니</button>&nbsp;
            <button onClick={()=>{navigate("/")}}className="btn btn-success">홈</button>
      </div>

    </div><p />
     <Nav variant="tabs" defaultActiveKey="link0">
        <Nav.Item>
          <Nav.Link onClick={()=>{setClickTab(0)}} eventKey="link0">환불정책</Nav.Link>
        </Nav.Item>
        <Nav.Item>
            <Nav.Link onClick={()=>{setClickTab(1)}}  eventKey="link1">교환방법</Nav.Link>
        </Nav.Item>
        <Nav.Item>
            <Nav.Link onClick={()=>{setClickTab(2)}}  eventKey="link2">상품평 </Nav.Link>
        </Nav.Item>
      </Nav> 

      <TabContent clickTab={clickTab} shrits={ props.shrits }/> 

    </div>
  );
}

//function TabContent(props) {
function TabContent({clickTab, shrits}) {

    // return (
    //   <div>
    //     [<div>내용0</div>, <div>내용1</div>, <div>내용2</div>][props.clickTab]
    //     {/* {shrits[0].title} */}
    //   </div>
    // )

  let {stock} = useContext(StockContext)
  let [fade, setFade] = useState('')

  useEffect(()=>{
    setTimeout(() => {  setFade('end') }, 10);
    return()=>{  setFade('') }
  }, [clickTab])


  // useEffect(()=>{
  //   let t = setTimeout(() => {  setFade('end') }, 30);
  //   return()=>{
  //     clearTimeout(t)
  //     setFade('')
  //   }
  // }, [clickTab])

  return (
      // <div className= {"start" + fade} >
      <div className= {`start  ${fade}`} >
        {/* {shrits[0].title } {shrits[0].price } */}
        {[<div>내용0</div>, <div>내용1</div>, <div>내용2</div>][clickTab]}
        {/* {stock[1]}   */}
      </div>
  )
    

  // if(clickTab == 0 ) {
  //   return <div>내용0</div>  
  // }
  // if(clickTab == 1 ) {
  //   return  <div>내용1</div>  
  // }
  // if(clickTab == 2 ) {
  //   return <div>내용2</div>  
  // }

}

export default Detail;