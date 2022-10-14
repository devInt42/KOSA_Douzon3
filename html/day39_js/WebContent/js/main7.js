/** main7.js */

// this 
function User(name) {
	this.name = name
}

User.prototype.arrow = () => {
	console.log(this.name)
}

const doyeon = {
	name: 'DoYeon',
	normal: function() {
		console.log(this.name)
	}
}

const doyeon2 = new User('DoYeon')
//doyeon2.normal()
doyeon2.arrow()


/*const doyeon = {
	name: 'DoYeon',
	normal: function() {
		console.log(this.name)
	},
	arrow: () =>{
		console.log(this.name)
	}
}

doyeon.normal()
doyeon.arrow()*/