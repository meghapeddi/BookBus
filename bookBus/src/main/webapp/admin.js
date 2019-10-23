function validateBusNo() 
{
    var busnum = document.forms["adminForm"]["busno"].value;
    var busregex = /(([A-Za-z]){2,3}(|-)(?:[0-9]){1,2}(|-)(?:[A-Za-z]){2}(|-)([0-9]){1,4})|(([A-Za-z]){2,3}(|-)([0-9]){1,4})/;

 if (busregex.test(busnum))
  {
    return (true)
  }
  else{
    alert("Invalid Bus Number")
    return false;
  }
}


function validateBusTime() 
{
    var bustdeptime = document.forms["adminForm"]["depttime"].value;
    var busarrtime = document.forms["adminForm"]["arrivaltime"].value;
    var timeregex = /^(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$/;

 if (timeregex.test(bustdeptime)&&timeregex.test(busarrtime))
  {
    return (true)
  }
  else{
    alert("Invalid Bus Timings")
    return false;
  }
}