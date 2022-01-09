package com.it.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.it.entity.Product;
import com.it.repository.ProductRepository;



public class ProductServiceImplMockTest {

    private ProductServiceImpl productServiceImpl;
    
    @Mock
    private ProductRepository productRepository;
    
    @Mock
    private Product product;
    
    @SuppressWarnings("deprecation")
	@Before
    public void setupMock() {
        MockitoAnnotations.initMocks(this);
        productServiceImpl=new ProductServiceImpl();
        productServiceImpl.setProductRepository(productRepository);
    }
    @Test
    public void shouldReturnProduct_whenGetProductByIdIsCalled() throws Exception {
        // Arrange
        when(productRepository.findById(5)).thenReturn(Optional.of(product));
        // Act
        Product retrievedProduct = productServiceImpl.getProductById(5);
        // Assert
        assertThat(retrievedProduct, is(equalTo(product)));

    }
    @Test
    public void shouldReturnProduct_whenSaveProductIsCalled() throws Exception {
        // Arrange
        when(productRepository.save(product)).thenReturn(product);
        // Act
        Product savedProduct = productServiceImpl.saveProduct(product);
        // Assert
        assertThat(savedProduct, is(equalTo(product)));
    }
    @Test
    public void shouldCallDeleteMethodOfProductRepository_whenDeleteProductIsCalled() throws Exception {
        // Arrange
        doNothing().when(productRepository).deleteById(5);
        Mockito.mock(ProductRepository.class);
        // Act
        productServiceImpl.deleteProduct(5);
        // Assert
        verify(productRepository, times(1)).deleteById(5);
    }
}