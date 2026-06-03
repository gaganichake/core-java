package com.corejava.java17;

// The listed subclasses can either be final, non-sealed, or sealed.
public final class SubClass extends SealedClasses implements SealedInterface{
}
/*
The permitted subclasses must have exactly one of the following modifiers
to describe how it continues the sealing initiated by its superclass:
1. A final class cannot be extended further.
2. A sealed class can only be extended by its permitted subclasses.
3. A non-sealed class can be extended by unknown subclasses as well.
4. A sealed class cannot force the sealing behavior to its permitted subclasses
 */
