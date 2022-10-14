/**
 * 
 */
const person ={
	firstName : 'Jungsoo',
	lastName : 'Ryu',
	getFullName : function(){
		return `${this.firstName} ${this.lastName}`
	}
	
}

console.log(person.firstName)
console.log(person.getFullName)


const amy = {
	firstName : 'Amy',
	lastName : 'Clarke',
	getFullName : function(){
		return `${this.firstName} ${this.lastName}`
	}
}

console.log(amy)

const neo = {
	firstName : 'Neo',
	lastName : 'Clarke',
	getFullName : function(){
		return `${this.firstName} ${this.lastName}`
	}
}

console.log(neo)
console.log(neo.getFullName)

function user(first, last){
	this.firstName = first
	this.lastName = last
}

const ps = new user('Happy','Kang')
console.log(ps)

const ps2 = {}
console.log(ps2)
const amy2 = new user('Amy', 'Clarke')
const neo2 = new user('Neo', 'Smith')
console.log(amy2)
console.log(neo2)

user.prototype.getFullName = function() {
	return ` 나의 이름은 ${this.firstName} ${this.lastName} 입니다.` 
}

console.log(ps.getFullName())
console.log(amy2.getFullName())
console.log(neo2.getFullName())


