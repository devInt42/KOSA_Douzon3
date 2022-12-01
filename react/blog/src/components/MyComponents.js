import { Component } from "react";

class MyComponents extends Component {
  // constructor(props) {
  //     super(props);
  //     this.state = {
  //         //상태변수(state variable)
  //         number : 0
  //     }
  // }

  // 상태변수 선언
  state = {
    number: 0,
    message: "",
    valdiate: false,
    messages: ["AngularJS", "React", "Vue", "Ember"],
  };

  render() {
    // 변수선언
    const { age, irum, name, str, hi } = this.props;
    const { number, message, valdiate, messages } = this.state;
    return (
      <>
        <h3>Hello {name} </h3>
        <h3>
          Hello {age} / {hi}{" "}
        </h3>
        <h4>상태변수 {number}</h4>
        <h5>메세지 {message}</h5>
      </>
    );
  }
}

export default MyComponents;
