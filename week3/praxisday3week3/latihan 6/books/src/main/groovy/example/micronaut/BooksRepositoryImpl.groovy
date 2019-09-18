/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.micronaut

import groovy.transform.CompileStatic
import javax.inject.Singleton

/**
 *
 * @author ramakira
 */
@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

    @Override
    List<Book> findAll() {
        [
            new Book("1491950358", "Building Microservices"),
            new Book("1680502395", "Release It!"),
        ]
    }
}

