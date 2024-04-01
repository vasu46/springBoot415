function doValidations(frm){
	//empty old from validation error message
	document.getElementById("enameErr").innerHTML="";
	document.getElementById("jobErr").innerHTML="";
	document.getElementById("salErr").innerHTML="";
	document.getElementById("deptnoErr").innerHTML="";
	
	//read from comp values
	let name=frm.ename.value;
	let desg=frm.job.value;
	let sal=frm.sal.value;
	let deptno=frml.deptno.value;
	let isValid=true;
	
	//write client side from validation logics
	if(name==""){
		document.getElementById("enameErr").innerHTML="Employee name is required";
		isValid=flase;
		
	}
	else if(name.length<5 ||name.length>15){
		 document.getElementById("enameErr").innerHTML="Emp Ename must be in 5 to 15";
		 isValid=flase;
	}
	if(desg==""){
		document.getElementById("jobErr").innerHTML="EmpJOB name is required";
		isValid=flase;
		
	}
	else if(desg.length<5 ||name.length>10){
		 document.getElementById("jobErr").innerHTML="Emp job must be in 5 to 10";
		 isValid=flase;
	}
	if(sal==""){
		document.getElementById("salErr").innerHTML="Emp sal must is required";
		isValid=flase;
		
	}
	else if(isNaN(sal)){
		document.getElementById("salErr").innerHTML="Emp Salary must be numeric values";
		isValid=false;
	}
	else if(sal<50000 ||name.length>200000){
		 document.getElementById("salErr").innerHTML="Emp Sal must be 50000 to 200000";
		 isValid=flase;
	}
	if(deptno==""){
		document.getElementById("deptnoErr").innerHTML="Employee deptno must is required";
		isValid=flase;	
	}
	return isValid;
	
	
}