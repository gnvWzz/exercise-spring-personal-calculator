package com.example.exercisespringpersonalcalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @RequestMapping(value = "/calculator")
    public ModelAndView showCalculator() {
        return new ModelAndView("calculator");
    }

    @RequestMapping(value = "/calculate")
    public ModelAndView calculate(@RequestParam("operator") String operator, @RequestParam("firstNum") long firstNum, @RequestParam("secondNum") long secondNum) {
        long result = 0;
        switch (operator) {
            case "Addition(+)":
                result = firstNum + secondNum;
                break;
            case "Subtraction(-)":
                result = firstNum - secondNum;
                break;
            case "Multiplication(X)":
                result = firstNum * secondNum;
                break;
            case "Division(/)":
                result = firstNum / secondNum;
                break;
            default:
                break;
        }
        ModelAndView modelAndView = new ModelAndView("calculator", "result",result);
        return modelAndView;
    }
}
