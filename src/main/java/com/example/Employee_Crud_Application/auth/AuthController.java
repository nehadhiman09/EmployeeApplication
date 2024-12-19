//package com.example.Employee_Crud_Application.auth;
//
//import com.example.Employee_Crud_Application.DTO.LoginRequest;
//import com.example.Employee_Crud_Application.DTO.RegisterRequest;
//import com.example.Employee_Crud_Application.Service.DepartmentService;
//import com.example.Employee_Crud_Application.Service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private EmployeeService employeeService;
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    @Autowired
//    private AuthService authService;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/login")
//    public ResponseEntity<AuthenticateResponse> authenticateEmployee(@RequestBody LoginRequest loginRequest) {
//        //Authenticate the User
//        //Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                //loginRequest.getEmail(), loginRequest.getPassword()));
//
//        //set the authenticate in the security context
//       // SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        //Return Success
//        return  ResponseEntity.ok(authService.authenticate(loginRequest));
//    }
//
//
//    @PostMapping("/register")
//    public ResponseEntity<AuthenticateResponse> registerEmployee(@RequestBody RegisterRequest registerrequest) {
//
//        //check here email is already exist or not
////if (employeeService.existByEmail(registerrequest.getEmail())) {
//            return  ResponseEntity<>(authService.register(registerrequest));
//        }
//
//        //create and set the employee details
////        Employee employee = new Employee();
////        employee.setfirstname(registerrequest.getfirstname());
////        employee.setlastname(registerrequest.getlastname());
////        employee.setemail(registerrequest.getemail());
////        employee.setpassword(registerrequest.getpassword());registerrequest
//
//        employeeService.registerEmployee(employee);
//
//        //register employee
//        return new ResponseEntity<>("Employee register successfully", HttpStatus.OK);
//    }
//
//
//}
