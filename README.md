**Retrofit Implementation with Dagger 2**

This repo contains the simple Dagger2 injection with Retrofit.

Dagger 2 is dependency injection framework. It uses code generation and is based on annotations. The generated code is very relatively easy to read and debug.

It uses following annotations:
1. `@Module` and `@Provides` - define classes and methods which provide dependencies
2. `@Inject` - request dependencies. Can be used on a constructor, a field, or a method
3. `@Component` - enable selected modules and used for performing dependency injection

_**Annotations & its usages**_

`@Module` - Used on classes which contains methods annotated with `@Provides`.

`@Provides` - Can be used on methods in classes annotated with `@Module` and is used for methods which provides objects for dependencies injection.

`@Singleton` - Single instance of this provided object is created and shared.

`@Component `- Used on an interface. This interface is used by Dagger 2 to generate code which uses the modules to fulfill the requested dependencies.
