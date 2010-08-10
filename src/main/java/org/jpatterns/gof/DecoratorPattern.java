package org.jpatterns.gof;

import org.jpatterns.core.*;

import java.lang.annotation.*;

/**
 * <b>Intent [GoF, pg 175]:</b> Attach additional responsibilities to an object
 * dynamically. Decorators provide a flexible alternative to subclassing for
 * extending functionality.
 * <p/>
 * <img src="http://www.jpatterns.org/uml/gof/DecoratorStructure.gif"/>
 *
 * @author Heinz Kabutz
 * @since 2010-08-09
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Documented
@DesignPattern(type = Type.STRUCTURAL,
    related = {AdapterPattern.class, CompositePattern.class,
        StrategyPattern.class})
public @interface DecoratorPattern {
  @Retention(value = RetentionPolicy.RUNTIME)
  @Target(value = ElementType.TYPE)
  @Documented
  public @interface Component {
  }

  @Retention(value = RetentionPolicy.RUNTIME)
  @Target(value = ElementType.TYPE)
  @Documented
  public @interface Decorator {
  }

  @Retention(value = RetentionPolicy.RUNTIME)
  @Target(value = ElementType.TYPE)
  @Documented
  public @interface ConcreteComponent {
  }

  @Retention(value = RetentionPolicy.RUNTIME)
  @Target(value = ElementType.TYPE)
  @Documented
  public @interface ConcreteDecorator {
  }
}