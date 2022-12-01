import React, { Component, useState } from "react";
import PropTypes from 'prop-types';

class MyComponents extends Component {

     //생성자
    // constructor(props) {
    //     super(props);
    //     this.state = {
    //         // 상태변수(state variable)
    //         number: 0,
    //         address : 'seoul',
    //     }
    // }

    //상태변수 선언
    state = {
        number: 0,
        message:'반가워요',
        validate: false,
        messages: ['AngularJS', 'React', 'Vue', 'Ember']
    }

    render() {

        //let [a, b] = useState(10);
        //let arr = [1,2];
        //console.log(arr[0]+", " + arr[1]);
        let [x, y] = [1,2];
        

        const {number, message, validate, messages} = this.state;
        const {str, name, irum, age, msg} = this.props;

        return(
            <>
                <h2>msg = {msg}</h2>
                <h3>Hello {message}/{validate}</h3>
                <h3>이것은 App에서 받아온것 </h3>                  
                {name} / {str} / {age} / {irum}
                <h4>상태변수 { number }</h4>
                {/* () => { function() } */}
                <button onClick={ 
                    () => { this.setState({
                    number: number + 1
                    })} 
                } >증가</button>
                <hr />
            </>
        );
    }
}

MyComponents.defaultProps = {
    msg : '기본값'
};

MyComponents.propTypes = {
    msg: PropTypes.string,
    age: PropTypes.number
}

export default MyComponents;
