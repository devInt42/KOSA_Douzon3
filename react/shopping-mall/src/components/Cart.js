import { memo, useEffect, useMemo, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { changeName, userNameChange, increase, plusCount,minusCount } from "../store";

// 꼭 필요할때만 재렌더링 하려면 memo
let Max = memo( function() {
//  function Max() {
  console.log('자손은 부모가 재렌더링될때 자손도 재랜더링된다.');
  return <div>자손입니다.</div>
} )

function LoopFn(){
  return <div>생성하는것을 1000번 정도 생성</div>
}

function Cart() {


  //useEffect(()=>{ return <div> </div> },[count] )
  //let result = useMemo(()=>{ return LoopFn() }, [count]);
    

    let state = useSelector( (state) => state )  // useSelector( () => {return } )
    let dispatch = useDispatch(); // store.js로 요청 보내주는 함수
    let [count, setCount] = useState(0);

    //console.log(state.cart[0].name);
    // console.log(state.stock);
    // console.log(state.user);
    // console.log(state.stock[2]);
    return(  
    <div>
      <Max></Max>  
      {/* 기존 props == 신규 props 계속 비교한다. */}
       <h1>{state.user.name}의 장바구니 / {state.user.age}</h1>
      <button onClick={ () => { 
        console.log("change");
        dispatch(changeName());
        dispatch(userNameChange())
    } }>버튼</button>

    <button onClick={()=>{
      //나이 1증가 함수 호출하기 
      dispatch(increase(100))
    }}>나이증가</button>

      <table class="table">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">상품명</th>
          <th scope="col">수량</th>
          <th scope="col">변경하기</th>
        </tr>
      </thead>
      <tbody>
      
      {
        state.cart.map( (a, i)=>
          <tr key={i}>
            <th scope="row">{state.cart[i].id}</th>
            <td>{state.cart[i].name}</td>
            <td>{state.cart[i].count}</td>
            <td><button onClick={()=>{
              //문제] 수량 증가
              //dispatch(plusCount(i))   // 1방법
              dispatch(plusCount(state.cart[i].id))  // 2방법
            }}>+</button></td>
               
            <td><button onClick={()=>{
              // 수량 감소 
              dispatch(minusCount(state.cart[i].id)) 
            }}>-</button></td>
            <td><button onClick={()=>{
              // 상품 1개 수량으로 변경
    
            }}>초기화</button></td>
          </tr>
          
        )
      }
     </tbody>
    </table>
    </div>
    )
}

export default Cart;