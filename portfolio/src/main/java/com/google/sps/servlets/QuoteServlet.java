// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet that responds with the current date. */
@WebServlet("/CBT-quotes")
public class QuoteServlet extends HttpServlet {
    public ArrayList<String> quotations = new ArrayList<String>();
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    quotations.add("In developing your mindset, practice compassion. What's a more empathetic and forgiving lens through which to view yourself and others?");
    quotations.add("Mindfulness is not the state of thinking about nothing. Rather, it is practicing focus and paying attention to the present moment.");
    quotations.add("Try naming frequent thought topics (e.g. money worry) to make it easier to notice and redirect your mind.");
    Gson gson = new Gson();
    String json = gson.toJson(quotations);
    //return json;
    response.getWriter().println(json);
  }

}
