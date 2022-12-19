import React from "react";

class LifeCycleCom extends React.Component {
    componentDidMount() {
      //컴포넌트 mount 될 때 코드 실행
    }
  
    componentDidUpdate(){
      //컴포넌트 update 될 때 코드 실행
    }
  
    componentWillUnmount(){
      //컴포넌트 unmount 될 때 코드 실행
    }
  
    // useEffect(()=>{ })
}

function Update() {

    useEffect(()=>{
        // 코드 
    });

    return(
        <></>
    )
}

export default {LifeCycleCom, Update};
  
/*
 useEffect(()=>{
    setTimeout(() => {
      setAlert(false);
    }, 3000,[count]);  // count 상태 변수의 변화가 있을때 실행됨
  })

  useEffect(()=>{
    setTimeout(() => {
      setAlert(false);
    }, 3000,[]);  // mount 일때만 실행됨
  })

 useEffect(()=>{
    setTimeout(() => {
      setAlert(false);
    }, 3000);  // mount, update 일때 실행됨
  })


 useEffect( () => {   })  재렌더링마다 코드 실행
 useEffect( () => {   }, [ ])  mount 될때 1회만 실행
 useEffect( () => {   }, [상태변수])  상태변수가 작동 될때 실행
 useEffect( () => {   }, 
    return () => {
	    unmount시 1회만 코드 실행 
   }, [  ] )

*/