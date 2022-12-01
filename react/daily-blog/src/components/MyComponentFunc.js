import { useState } from "react";

//function MyComponentFunc(props) {   // 1
//const MyComponentFunc = (props) => { // 2
const MyComponentFunc = ({irum, children}) => {  // 3

    let [item, setItem] = useState(9);

    return(
        <div>
            {/* <h2>나는 {props.irum} </h2> */}
            <h3 onClick={()=>{ setItem(item + 1) }}>Item : {item + 1} </h3>
            <h2>나는 {irum} </h2>
            {children}
        </div>
    );
}

// function MyComponentFunc2(props) {
//     return(
//         <div>
//               <h2>나는 {props.irum} </h2>
//             <h3>나는 MyComponentFunc2 컴포넌트입니다.</h3>
//             {/* {children} */}
//         </div>

//     );
// }

// function MyComponentFunc3() {
//     return(
//         <div>
//             <h3>나는 MyComponentFunc3 컴포넌트입니다.</h3>
//             {/* {children} */}
//         </div>

//     );
// }

//export default {MyComponentFunc, MyComponentFunc3, MyComponentFunc2 };
export default MyComponentFunc;