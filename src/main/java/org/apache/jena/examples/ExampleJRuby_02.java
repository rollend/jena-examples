/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExampleJRuby_02 {

    public static void main(String[] args) throws FileNotFoundException {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine ruby = sem.getEngineByExtension("rb");
        try {
            FileReader reader = new FileReader(new File("src/main/ruby", "hello_world.rb"));
            ruby.eval(reader);
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }
    }
}
