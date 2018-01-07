/**
 * 
 */
"user strict";
export const EventBuilder = {
	
	"pushEvent" : function(arr) {
		if(!(arr instanceof Array)) throw "배열이 아닙니다.";
		
		arr.forEach(function(elt, i) {
			console.log(elt);
		});
		
	},
	"pushEventAll" : function() {
		
	}
};
