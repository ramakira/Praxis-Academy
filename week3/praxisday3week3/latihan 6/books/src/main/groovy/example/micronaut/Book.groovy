/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.micronaut

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

/**
 *
 * @author ramakira
 */
@CompileStatic 
@TupleConstructor
class Book {
    String isbn
    String name
}

